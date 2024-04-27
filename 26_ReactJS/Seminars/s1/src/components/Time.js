function CurrentTime() {
    return (
        <h2 style={{ backgroundColor: "#f0f0f0", padding: '10px', borderRadius: '500px' }}>
            Текущее время: {new Date().toLocaleTimeString()}
        </h2>
    )
}


export default CurrentTime;