package co.com.sophos.tienda.domain.service;


import co.com.sophos.tienda.domain.Product;
import co.com.sophos.tienda.domain.repository.ProductRepository;
import co.com.sophos.tienda.persistent.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductoRepository productoRepository;


    public List<Product> getAll(){

        return productoRepository.getAll();
    }

    public Optional<Product> getProduct(int productId){

        return productoRepository.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(int categoryId){
        return productoRepository.getByCategory(categoryId);
    }

    public Product save(Product product){
        return  productoRepository.save(product);
    }

    public boolean delete(int productId){
        return  getProduct(productId).map(product -> {
            productoRepository.delete(productId);
            return true;
        }).orElse(false);
    }



}
