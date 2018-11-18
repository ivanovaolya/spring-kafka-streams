package com.streams.bindings;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface ProductsBinding {

    String INPUT = "products-in";
    String OUTPUT = "products-out";

    @Input(INPUT)
    SubscribableChannel inboundProducts();

    @Output(OUTPUT)
    MessageChannel outboundProducts();

}
