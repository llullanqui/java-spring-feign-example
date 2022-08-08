package com.ChapterDesarrollo.FeignClient.dto.person;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {

    private String id;

    private String name;

    private String avatar;

    private String email;

    private int calls;

}
