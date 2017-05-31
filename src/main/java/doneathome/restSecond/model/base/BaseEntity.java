package doneathome.restSecond.model.base;

import java.io.Serializable;

/**
 * Created by dzhukov on 31.05.17.
 */
public abstract class BaseEntity implements IdHolder, Serializable {

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BaseEntity that = (BaseEntity) o;

        if (getId() == null || !getId().equals(that.getId())) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : super.hashCode();
    }
}
