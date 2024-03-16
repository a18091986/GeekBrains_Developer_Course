// установка NodeJS
// nodejs.org


// Варианты запуска
// 1.REPL
// 2. .js


// ---------------------------------------------------------------------------------------
// const arr = [1, 2, 3, 4]
// const sum = arr.reduce((acc, number) => acc += number, 10);
// console.log(sum);
// ---------------------------------------------------------------------------------------

// ---------------------------------------------------------------------------------------
const http = require('http');
const server = http.createServer((req, res) => {
    if (req.url === '/') {
        res.writeHead(200, {
        'Content-Type': 'text/html; charset=UTF-8'
    });
    res.end('<h1>welcome!</h1>')
    } else if (req.url === '/about') {
        res.writeHead(200, {
        'Content-Type': 'text/html; charset=UTF-8'
    });
    res.end('<h1>About!</h1>')
    } else {
        res.writeHead(404, {
        'Content-Type': 'text/html; charset=UTF-8'
    });
    res.end('<h1>Не найдено!</h1>')
    }

    console.log("Запрос получен");
})
const port = 3000;

server.listen(port, () => {
    console.log(`Сервер запущен на порту ${port}`);
})
// ---------------------------------------------------------------------------------------


