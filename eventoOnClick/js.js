const a = () => {
    const btn = document.getElementById('botonCambiar');
    btn.innerHTML = btn.innerHTML === 'Iniciar sesión' ? 'Cerrar sesión' : 'Iniciar sesión';
}

const alerta = () => {
    alert('Gato atigrado was liked');
}

const desaparece = () => {
    const btn = document.getElementById('botonDesaparecer').classList.add('hidden');
}