const a = () => {
    const btn = document.getElementById('botonCambiar');
    btn.innerHTML = btn.innerHTML === 'Iniciar sesión' ? 'Cerrar sesión' : 'Iniciar sesión';
}

const alerta = (numero) => {
    alert('Gato atigrado was liked');
    if (numero === 1) {
        document.getElementById('contador1').innerHTML++
    } else {
        document.getElementById('contador2').innerHTML++
    }
}

const desaparece = () => {
    const btn = document.getElementById('botonDesaparecer').classList.add('hidden');
}