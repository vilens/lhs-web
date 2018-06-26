package club.luhuishan.web.service;

import club.luhuishan.web.domain.po.Product;
import club.luhuishan.web.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vilens on 2018/6/13.
 */
@Service
public class IndexService {

    @Autowired
    ProductMapper productMapper;

    public List<Product> randomRefresh(Integer limit){
        return productMapper.randomRefresh(limit);
    }
}
