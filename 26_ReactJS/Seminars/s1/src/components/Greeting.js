function Greeting () {
    let now = new Date().getHours() < 12;
    return (
        <div>
            <h1> {now ? 'Доброе утро': 'Доброго дня' }</h1>
        </div>
    )
}

export default Greeting