package com.streams.config;

import com.streams.bindings.ProductsBinding;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(ProductsBinding.class)
public class CustomStreamsConfig {
}
