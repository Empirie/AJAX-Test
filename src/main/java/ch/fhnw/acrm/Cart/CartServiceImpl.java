package ch.fhnw.acrm.Cart;

//https://github.com/syqu22/spring-boot-shop-sample/blob/master/src/main/java/com/syqu/shop/service/impl/ShoppingCartServiceImpl.java


import ch.fhnw.acrm.products.Products;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Transactional
public class CartServiceImpl {




}
