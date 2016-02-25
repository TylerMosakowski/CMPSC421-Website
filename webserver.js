var express = require('express');
var fs = require('fs');
var bodyParser  = require('body-parser');

var ChatServer  = require('./CloudChat/ChatServer');
var syllabus  = require('./Syllabus/syllabus');


//setup the root path
var root = __dirname;
ChatServer.gettool.root = root;
syllabus.gettool.root = root;

var app     = express();
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({
  extended: true
}));
app.set("jsonp callback", true);

app.get('/', function (req, res) {
	fs.readFile('home.html', 'utf8', function (err,data) {
		if (err) {
			return console.log(err);	
		}
	res.send(data);
	});	
});
app.get('/about.html', function (req, res) {
	fs.readFile('about.html', 'utf8', function (err,data) {
		if (err) {
			return console.log(err);	
		}
	res.send(data);
	});	
});
app.get('/side.html', function (req, res) {
	fs.readFile('side.html', 'utf8', function (err,data) {
		if (err) {
			return console.log(err);	
		}
	res.send(data);
	});	
});

app.use(express.static('.'));			// Serves up files from the current directory

app.get('/ThreeRegion/*', threeregion);
function threeregion(req, res) {
	var fileName = root +req.path;
	  res.sendFile(fileName, function (err) {
	    if (err) {
	      console.log(err);
	      res.status(err.status).end();
	    }
	    else {
	      console.log('Sent:', req.path);
	    }
	  });
}
function gettool(req,res){
	if(/JSONP/.exec(req.path)!=null) handleJSONP(req,res);
	else{
		var fileName = gettool.root+req.path;
		res.sendFile(fileName,function(err) {
			if(err){
				console.log(err);
				res.status(err.status).end();
			}
			else{
				console.log("Sent: "+req.path);
			}
		}
	}
}
function sendJSONP(res,uid){
	var nextObject = {};
	nextObject.Q = questions[getIndex(uid)-1];
	var pAns = getAnswer(uid);
	if(pAns !==''){
		nextObject.previousAns=pAns;
	}
	res.jsonp(JSON.stringify(nextObject));
}
function handleJSONP(req,res){
	if(req.path==="/EvalJSON/next"){
		if(req.query.answer!=null)
			updateAnswer(req.query.userID,req.query.answer);
		increaseIndex(req.query.userID);
		sendJSONP(res,req.query.userID);
	}
	else if(req.path==="/EvalJSON/last"){
		if(req.query.answer!=null)
			updateAnswer(req.query.userID,req.query.answer);
		decreaseIndex(req.query.userID);
		sendJSONP(res,req.query.userID);
	}
}

app.get('/CloudChat/*', ChatServer.gettool);
app.get('/Syllabus/*', syllabus.gettool);
app.get('/EvalJSON/*', startPage.posttool);


app.listen(8080, function() {
  console.log('Server running at http://127.0.0.1:8080/');
});