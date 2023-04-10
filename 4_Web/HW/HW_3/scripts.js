// let name = prompt("Как вас зовут", "Введите имя");
// alert (`Привет, ${name}!`);

// let name = 'Алевтина';

// function show_msg() {
//     let text = 'Привет, ' + name + '!';
//     alert(text);
// }

// show_msg();

// alert(confirm("Are you okey?") ? `fine`: `sleep`);

// #################################----Change Styles----################################

body = document.querySelector(".light");
let themeButton = document.querySelector('.Theme_button');
themeButton.onclick = function () {
    body.classList.toggle('light');
    body.classList.toggle('dark');
}





// ##################################----HW----###########################################

function on_click() {
    var InputValue = document.getElementById(`input_email`).value;
    if (InputValue) {
        alert (`Email ${InputValue} was send in DB`);    
    }
    else {
        alert (`Empty Field!`);
    }
}

