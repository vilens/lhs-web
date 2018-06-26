package club.luhuishan.web.mapper;

import club.luhuishan.web.domain.po.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by vilens on 2018/6/13.
 */
public interface ProductMapper {
    List<Product> randomRefresh(@Param("limit") Integer limit);
}
