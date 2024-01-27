async function fetchData () {
    try {
        const response = await fetch('data.json');
        if (!response.ok) {
            throw new Error('не удалось получить данные с data json');
        }
        const data = await response.json();
        const productBox = document.querySelector('.product__box');
        data.forEach(({name, img, price, color, size, quantity}) => {
            const productEl = `
                    <div class="product">
                    <button class="btn__del"></button>
                    <div class="content">
                        <img src="${img}" alt="${name}" class="product__img">
                        <div class="product__desc">
                        <h2 class="product__name">${name}</h2>
                        <p class="product__price_label">Price: <span class="product__price">$${price}</span></p>
                        <p class="product__color">Color:${color}</p>
                        <p class="product__size">Size:${size}</p>
                        <div class="product__qty">
                            <label for="" class="input__label">Quantity</label>
                            <input type="text" class="input__quantity" value="${quantity}"/>
                        </div>
                        </div>
                    </div>
                </div>`;
                productBox.insertAdjacentHTML('beforeend', productEl);
        });

        const btns = document.querySelectorAll('.btn__del');
        btns.forEach((el) => {
            el.addEventListener('click', () => {
                const product = el.closest('.product');
                product.remove();
            });
        });
    } catch (error) {
        console.error(error);
    }
}

fetchData()

