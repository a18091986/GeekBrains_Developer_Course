import React from 'react';

import { useSelector, useDispatch } from 'react-redux';

import { removeProduct, toggleAvailability } from '../redux/productsSlice';



const ProductList = () => {

  const products = useSelector((state) => state.products.products);

  const dispatch = useDispatch();



  return (

    <div>

      {products.map((product) => (

        <div key={product.id} className="product">

          <h2>{product.name}</h2>

          <p>{product.description}</p>

          <p>Price: ${product.price}</p>

          <p>Available: {product.available ? 'Yes' : 'No'}</p>

          <button onClick={() => dispatch(removeProduct(product.id))}>Delete</button>

          <button onClick={() => dispatch(toggleAvailability(product.id))}>

            Toggle Availability

          </button>

        </div>

      ))}

    </div>

  );

};



export default ProductList;