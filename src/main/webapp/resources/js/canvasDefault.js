if (!canvasDefault) var canvasDefault = {}

if (!canvasDefault.js) {
  canvasDefault.js = {
    init : function(canvasId, penColor, lineWidth) {
      var canvas, context, painting;

      canvas = document.getElementById(canvasId);
      if (canvas == null) {
        alert("Canvas " + canvasId + " not found")
      }

      context = canvas.getContext("2d")
      if (context == null)
        return;

      painting = false;

      context.strokeStyle = penColor
      context.lineWidth = lineWidth
      context.font = "15px Helvetica"

      canvas.addEventListener("mousedown", function(ev) {
        painting = true
        context.beginPath()
        context.moveTo(ev.offsetX, ev.offsetY)
      }, false)

      canvas.addEventListener("mousemove", function(ev) {
        updateReadout(ev.offsetX, ev.offsetY)

        if (painting) {
          paint(ev.offsetX, ev.offsetY)
        }
        function updateReadout(x, y) {
          context.clearRect(0, 0, 100, 20)
          context.fillText("x: " + x + ",  y: " + y, 5, 15)
        }
        function paint(x, y) {
          context.lineTo(ev.offsetX, ev.offsetY)
          context.stroke()
        }

      }, false)

      canvas.addEventListener("mouseup", function() {
        painting = false
        context.closePath()
      }, false)
    }
  }
}