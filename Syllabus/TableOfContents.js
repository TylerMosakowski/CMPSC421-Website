
window.onload = function () {

    var table = "";
    var level = 0;

    document.getElementById("contents").innerHTML =
        document.getElementById("contents").innerHTML.replace(
            /<h([\d])>([^<]+)<\/h([\d])>/gi, function (str, openLevel,
                titleText, closeLevel) {

                if (openLevel != closeLevel) {
                    return str;
                }

                if (openLevel > level) {
                    table += (new Array(openLevel - level + 1)).join("<ul>");
                } else if (openLevel < level) {
                    table += (new Array(openLevel - level + 1)).join("<ul>");
                }

                level = parseInt(openLevel);

                var anchor = titleText.replace(/ /g, "_");
                table += "<li><a href=\"#" + anchor + "\">" + titleText
                    "</a></li>";

                return "<h" + openLevel + "><a name=\"" + anchor + "\">"
                    + titleText + "</a></h" + closeLevel + ">";
            }
        );

    if (level)
        table += (new Array(level + 1)).join("</ul>");

    document.getElementById("table").innerHTML += table;

};