// Задание 1
// 1. Поиск в интернете (бесплатные api примеры).
// 2. Найти любые данные, на произвольную тему.
// 3. Создать файл data.js.
// 4. Создать переменную которая будет хранить данные из публичных api.

// Задание 2
// 1. Создать файл index.html.
// 2. Подключить data.js.
// 3. Сформировать контент из данных (картинка загловок и параграф).
// 4. Добавить данный контент в вёрстку.
// 5. * Добавить стили при необходимости (по желанию).

// объединены, данные поступают c api и отображаются в index.html

import { data } from "./api.js";

const content = document.querySelector('.content');


data.forEach(({number, text}) => {
    const div = document.createElement('div');
    div.classList.add('card');
    div.style.display = 'inline-block';
    div.style.marginRight = '10px';
    div.style.width = "300px";
    div.style.textAlign = "center";
    content.appendChild(div);

    const img = document.createElement('img');
    img.classList.add('card-top');
    img.src = "https://i.pinimg.com/564x/90/44/a6/9044a634e09b2a633ff73efad0fdf470.jpg"
    img.width = 300;
    img.height = 300;
    div.appendChild(img);

    const cardBody = document.createElement('div');
    cardBody.classList.add("card-body");
    div.appendChild(cardBody);

    const num = document.createElement('h1');
    num.classList.add('card-text');
    
    num.textContent = number
    cardBody.appendChild(num);

    const desc = document.createElement('h3');
    desc.classList.add('card-title');
    desc.textContent = text;
    cardBody.appendChild(desc);
});