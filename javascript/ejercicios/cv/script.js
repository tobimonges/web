document.getElementById('contacto').addEventListener('submit', function(e) {
    e.preventDefault();
    let mensaje = document.getElementById('mensaje').value;

    if (mensaje.trim() !== '') {
        console.log(`Mensaje enviado: ${mensaje}`);

        document.getElementById('mensaje').value = '';

        document.getElementById('enviar').textContent = 'Mensaje enviado con exito!';
        
    }
})


document.getElementById('descargar').addEventListener('click', async function () {
    // Seleccionar el contenido que queremos capturar
    const elemento = document.getElementById('contenido');

    // Usar html2canvas para capturar el contenedor como una imagen
    const canvas = await html2canvas(elemento);

    // Convertir el canvas a una imagen en formato DataURL
    const imgData = canvas.toDataURL('image/png');

    // Crear un PDF con jsPDF
    const { jsPDF } = window.jspdf; // Importar la clase jsPDF
    const pdf = new jsPDF({
        orientation: 'portrait', // Orientación
        unit: 'mm',              // Unidades
        format: 'a4'             // Formato del PDF
    });

    // Calcular dimensiones para ajustar la imagen al tamaño A4
    const imgWidth = 210; // Ancho en mm para formato A4
    const pageHeight = 297; // Alto en mm para formato A4
    const imgHeight = (canvas.height * imgWidth) / canvas.width; // Ajuste proporcional
    let position = 0;

    // Agregar la imagen al PDF
    pdf.addImage(imgData, 'PNG', 0, position, imgWidth, imgHeight);

    // Descargar el PDF
    pdf.save('CV.pdf');
});
