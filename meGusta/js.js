const like = (a) => {
    switch (a) {
        case 1:
            document.querySelector('#numero1').innerHTML++
            break;
        case 2:
            document.querySelector('#numero2').innerHTML++
            break;
        case 3:
            document.querySelector('#numero3').innerHTML++
            break;
        default:
            break;
    }
}