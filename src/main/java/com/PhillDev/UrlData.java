package com.PhillDev;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor

public class UrlData {
    private String originalUrl;
    private long expirationTime;
}