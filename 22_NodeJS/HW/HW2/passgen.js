function choose(choices) {
  let index = Math.floor(Math.random() * choices.length);
  return choices[index];
}

function rand_sym() {
    const syms = ['a', 'b', 'c']
    return choose(syms)
}

function rand_dig() {
    return Math.ceil(Math.random() * 10)
}

function genPass() {
    let result = '';
    for (let i = 0; i < 5; i++) {
        let choice = choose(['digit', 'symbol']) 
        if (choice === 'digit') {
            result += rand_dig().toString()
        }
        else {
            result += rand_sym()
        }
    }
    return result
}

module.exports = { genPass }

