<button ondblclick="changeBtn(this)">Button 1</button>
<button ondblclick="changeBtn(this)">Button 2</button>
<button ondblclick="changeBtn(this)">Button 3</button>

<p id="msg"></p>

<script>
function changeBtn(btn) {
  btn.style.backgroundColor = "blue";
  document.getElementById("msg").innerText = "Good Job!";
}