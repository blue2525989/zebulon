
package com.bierbrauer.zebulon.notes;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("unused")
public class Note {

    private String body;

    private String noteId;

}
