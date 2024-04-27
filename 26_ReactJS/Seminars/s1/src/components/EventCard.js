function EventCard ({id, title, date, time}) {
    return (
        <div className='card'>
            <h1>Карточка {id}</h1>
            <p>{title}</p>
            <p>{date}</p>
            <p>{time}</p>
        </div>
    )
}

export default EventCard;