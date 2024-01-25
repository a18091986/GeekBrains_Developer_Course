const inputEl = document.querySelector('.check');
const formEl = document.querySelector('.form');

inputEl.addEventListener('click', function (e) {
    const target = e.target;
    console.log(target.value, target.checked);
});

formEl.addEventListener('submit', function (e) {
    if (inputEl.checked) {
        console.log('Good');
    } else {
        console.log('Поставь галочку');
        e.preventDefault()
    }
});