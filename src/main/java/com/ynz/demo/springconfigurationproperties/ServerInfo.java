package com.ynz.demo.springconfigurationproperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ServerInfo {
    private String name;
    private List<String> ports;
}
