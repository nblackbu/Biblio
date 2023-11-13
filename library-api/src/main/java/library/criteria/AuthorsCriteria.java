package library.criteria;

import lombok.Getter;
import lombok.Setter;
import net.n2oapp.platform.jaxrs.RestCriteria;
import org.springframework.data.domain.Sort;

import javax.ws.rs.QueryParam;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;


public class AuthorsCriteria extends RestCriteria {

        @QueryParam("id")
        private String id;

        @QueryParam("name")
        private String name;

        @Override
        protected List<Sort.Order> getDefaultOrders() {
                return Collections.singletonList(Sort.Order.asc("name"));
        }
}
