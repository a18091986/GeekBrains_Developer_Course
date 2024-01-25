const form = document.querySelector('form')
const list = document.querySelector('ul')

list.addEventListener('click', function (e) {
    console.log('В первом UL в фазе захвата');
    const propagationControlMethodName = form.elements['propagation-control'].value;
    console.log(propagationControlMethodName);
    if (propagationControlMethodName) {
        e[propagationControlMethodName]()
    }

}, true);

list.addEventListener('click', () => {
    console.log('во втором UL в фазе захвата');
}, true)
list.addEventListener('click', () => {
    console.log('В первом UL в фазе всплытия');
});
Array.from(list.children).forEach((child) => {
    child.addEventListener('click', function (e) {
        console.log('В каждом LI в фазе всплытия');
    });
});