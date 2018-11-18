package com.streams.service;

import com.streams.bindings.ProductsBinding;
import com.streams.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductsBinding productsBinding;

    public void sendProduct(final Product product) {
        log.info("Sending the product: {}", product);
        productsBinding.outboundProducts()
                .send(MessageBuilder
                        .withPayload(product)
                        .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                        .build());
    }

    @StreamListener(ProductsBinding.INPUT)
    public void handleProducts(@Payload Product product) {
        log.info("Received product: {}", product);
    }

}
