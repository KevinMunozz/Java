function validarForma(forma) {
    var usuario = forma.usuario;//para recuperar del formulario
    if (usuario.value === "" || usuario.value === "Escribir usuario") {
        alert("Debes proporcionar un nombre de usuario");//una alerta con el mesaje
        usuario.focus();//
        usuario.select();//para que sepa lo que debe de modfificar
        return false;
        // si ponemos false no envia hacia el servlet sino que vuelve al
        //usuario para que corriga sus datos
    }
    var password = forma.password;
    if (password.value === "" || password.value.length < 3) {
        alert("Debes proporcionar un password mayor a 3 caracteres");
        password.focus();
        password.select();
        return false;
    }
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    for (var i = 0; i < tecnologias.length; i++) {
        if (tecnologias[i].checked) {
            //si el elemento a sido checado
            checkSeleccionado = true;
        }
    }
    if (!checkSeleccionado) {
        alert("Debe seleccionar una tecnologia");
        return false;
    }
    //el radio Tambien regresa un arreglo
    var generos = forma.genero;
    var radioSeleccionado = false;
    for (var i = 0; i < generos.length; i++) {
        if (generos[i].checked) {
            radioSeleccionado = true;
        }
    }
    if (!radioSeleccionado) {
        alert("Debes seleccionar un genero");
        return false;
    }
    var ocupacion = forma.ocupacion;
    if (ocupacion.value === "") {
        alert("Debes seleccionar una ocupacion");
        return false;
    }
    //formulario valido si llega hasta aqui
    alert("Formulario valido");
    return true;
}

