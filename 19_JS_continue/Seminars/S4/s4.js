const changeHeader = () => {
    const input = document.querySelector('#input');
    const header = document.querySelector('h1');
    header.innerText = input.value;
}

input.addEventListener('input', changeHeader);