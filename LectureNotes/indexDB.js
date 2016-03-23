<!DOCTYPE html>
<html>
<head>
<title>Google Map</title>
<link rel="stylesheet" type="text/css" href="indexDB.css">
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>    
<script type="text/javascript" src="indexDB.js"></script>
</head>

<body>

    <h1>IndexedDB Demo: storing blobs, e-publication example</h1>
    <div class="note">
      <p>
        Works and tested with:
      </p>
      <div id="compat">
      </div>
    </div>

    <div id="msg">
    </div>

    <form id="register-form">
      <table>
        <tbody>
          <tr>
            <td>
              <label for="pub-title" class="required">
                Title:
              </label>
            </td>
            <td>
              <input type="text" id="pub-title" name="pub-title" />
            </td>
          </tr>
          <tr>
            <td>
              <label for="pub-biblioid" class="required">
                Bibliographic ID:<br/>
                <span class="note">(ISBN, ISSN, etc.)</span>
              </label>
            </td>
            <td>
              <input type="text" id="pub-biblioid" name="pub-biblioid"/>
            </td>
          </tr>
          <tr>
            <td>
              <label for="pub-year">
                Year:
              </label>
            </td>
            <td>
              <input type="number" id="pub-year" name="pub-year" />
            </td>
          </tr>
        </tbody>
        <tbody>
          <tr>
            <td>
              <label for="pub-file">
                File image:
              </label>
            </td>
            <td>
              <input type="file" id="pub-file"/>
            </td>
          </tr>
          <tr>
            <td>
              <label for="pub-file-url">
                Online-file image URL:<br/>
                <span class="note">(same origin URL)</span>
              </label>
            </td>
            <td>
              <input type="text" id="pub-file-url" name="pub-file-url"/>
            </td>
          </tr>
        </tbody>
      </table>

      <div class="button-pane">
        <input type="button" id="add-button" value="Add Publication" />
        <input type="reset" id="register-form-reset"/>
      </div>
    </form>

    <form id="delete-form">
      <table>
        <tbody>
          <tr>
            <td>
              <label for="pub-biblioid-to-delete">
                Bibliographic ID:<br/>
                <span class="note">(ISBN, ISSN, etc.)</span>
              </label>
            </td>
            <td>
              <input type="text" id="pub-biblioid-to-delete"
                     name="pub-biblioid-to-delete" />
            </td>
          </tr>
          <tr>
            <td>
              <label for="key-to-delete">
                Key:<br/>
                <span class="note">(for example 1, 2, 3, etc.)</span>
              </label>
            </td>
            <td>
              <input type="text" id="key-to-delete"
                     name="key-to-delete" />
            </td>
          </tr>
        </tbody>
      </table>
      <div class="button-pane">
        <input type="button" id="delete-button" value="Delete Publication" />
        <input type="button" id="clear-store-button"
               value="Clear the whole store" class="destructive" />
      </div>
    </form>

    <form id="search-form">
      <div class="button-pane">
        <input type="button" id="search-list-button"
               value="List database content" />
      </div>
    </form>

    <div>
      <div id="pub-msg">
      </div>
      <div id="pub-viewer">
      </div>
      <fieldset>
        <legend>Publication List</legend>
        <ul id="pub-list">
        </ul>
      </fieldset>
    </div>
</body>
</html>
