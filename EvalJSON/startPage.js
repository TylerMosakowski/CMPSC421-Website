function posttool(req, res){
	console.log("Post Path: "+req.path);
	if(req.path==="/EvalJSON/sendmail"){
		sendmail(req,res);
	}
	else if(req.path==="/EvalJSON/start"){
		newUser(req.body.userID);
		sendFile(res,"QuestionPage.html");
	}
	else if(req.path==="/EvalJSON/submit"){
		console.log("Submit: "+req.body.userID);
		console.log("Submit: "+req.body.answer);
		if(req.body.answer!=null)
			updateAnswer(req.body.userID,req.body.answer);
		sendpage(res,"results.html");
	}
}
exports.posttool = posttool;