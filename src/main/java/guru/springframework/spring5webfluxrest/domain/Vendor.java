package guru.springframework.spring5webfluxrest.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by virru on 05/11/2022
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class Vendor {
    @Id
    private String id;
    private String firstName;
    private String lastName;
}
