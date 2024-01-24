// document.querySelector('button').onclick = function () {
//     console.log("Событие он клик");
// }

// // function onBtn() {
// //     console.log("Событие онклик");
// // }
// // --------------------------------------------------------------------------
// window.addEventListener('load', () => {
//     console.log("Страница прогрузилась!");
// });

// // window.onload = function () {
// //     console.log("Страница прогрузилась");
// // }
// // --------------------------------------------------------------------------
// const btns = document.querySelectorAll('button');

// // for (const btn of btns) {
// //     btn.onclick = function() {
// //         console.log(`Нажата ${btn.textContent}`);
// //     }
// // }

// btns.forEach((el) => {
//     el.onclick = function () {
//         console.log(`Нажата кнопка ${el.textContent}`);
//     }
// })
// // ----------------------------------------------------------
// document.querySelector('#btn5').addEventListener('click', function () {
//     this.textContent = `Вы нажали ${this.textContent}`;
//     this.style.color = 'white';
//     this.style.backgroundColor = 'black';
//     console.log('Кнопка пять обработана');
// });


// document.querySelector('#btn5').addEventListener('mouseover', function() {
//     this.innerText = "догони";
//     this.style.backgroundColor = 'red';
//     this.style.transition = 'all 0.5s ease-in-out';
//     let x = Math.random() * window.innerWidth / 2;
//     let y = Math.random() * window.innerHeight / 2;
//     this.style.transform = `translate(${x}px, ${y}px)`;
//     this.disabled = true;
// });

// let counter = 0

// document.querySelector('#btn4').addEventListener('click', () => {
//     console.log(`btn4 is clicked ${++counter} times`);
// });

// -----------------------------------------------------------------------

// const buttonsData = [
//     {id: 'add', text: 'Добавить заголовок', clickHandler: addHeading},
//     {id: 'remove', text: 'Удалить заголовок', clickHandler: removeHeading},
//     {
//         id: 'hover', 
//         text: 'Кнопка с наведением', 
//         mouseoverHandler: handleHoveIn,
//         mouseoutHandler: handleHoveOut
//     }
// ]

// function addHeading () {
//     const heading = document.createElement('h1');
//     heading.textContent = 'новый заголовок';
//     document.body.appendChild(heading);
// };

// function removeHeading () {
//     const heading = document.querySelector('h1');
//     if (heading) {
//         heading.remove();
//     }
// };

// function handleHoveIn () {
//     console.log('Вы навели на данную кнопку');
// };

// function handleHoveOut () {
//     console.log('Вы убрали указатель с кнопки');
// };

// function createButtons () {
//     const btnContainer = document.querySelector('div');
//     buttonsData.forEach((el) => {
//         const btn = document.createElement('button');
//         btn.id = el.id;
//         btn.textContent = el.text;
        
        
//         if (el.clickHandler) {
//             btn.onclick = el.clickHandler;
//         }


//         if (el.mouseoverHandler) {
//             btn.onmouseover = el.mouseoverHandler;
//         }

//         if (el.mouseoutHandler) {
//             btn.onmouseout = el.mouseoutHandler;
//         }

//         btnContainer.appendChild(btn);
//     })
// };

// createButtons();

// -----------------------------------------------------------------------------
document.querySelector('#add').addEventListener('click', addListItem);
document.querySelector('#remove').addEventListener('click', removelastListItem);
document.querySelector('#add_id').addEventListener('click', () => {
    document.querySelector('ul').lastElementChild.setAttribute('id', 'last_li');
});

function addListItem () {
    const list = document.querySelector('ul');
    const newItem = document.createElement('li');
    newItem.textContent = 'Новый элемент';
    list.appendChild(newItem);
}

function removelastListItem () {
    const list = document.querySelector('ul');
    if (list.lastElementChild) {
        list.lastElementChild.remove()
    }
}