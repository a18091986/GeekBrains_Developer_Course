const passwordField = document.querySelector('#password-field');
const submitButton = document.querySelector('#submit-button');
const showPassword = document.querySelector('#showPassword')
const form = document.querySelector('form');

showPassword.style.display = 'none';
// showPassword.style.margin = '300px';
form.style.margin = '300px'

form.addEventListener('submit', function (e) {
    e.preventDefault();
    if (passwordField.value === 'пароль') {
        passwordField.style.borderColor = "green";
        passwordField.style.borderWidth = "3px";
        passwordField.setCustomValidity('Пароль верный')
    } else {
        passwordField.style.borderColor = "red";
        passwordField.style.borderWidth = "3px";
        passwordField.setCustomValidity('Пароль неверный')
    }
    passwordField.reportValidity();
});

passwordField.addEventListener('input', function (e) {
    passwordField.setCustomValidity("");
});

passwordField.addEventListener('input', () => {
    if (passwordField.value === '') {
        showPassword.style.display = 'none'
    } else {
        showPassword.style.display = "inline-block"
    }
})

showPassword.addEventListener('click', (event) => {
    event.preventDefault();
    const type = passwordField.getAttribute('type') === 'password' ? 'text' : 'password';
    passwordField.setAttribute("type", type);
    showPassword.textContent = 
    type === 'password' ? 'покажи пароль' : 'скрыть пароль';
})