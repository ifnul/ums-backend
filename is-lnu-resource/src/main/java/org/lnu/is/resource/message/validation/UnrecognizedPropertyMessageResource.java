package org.lnu.is.resource.message.validation;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;

import java.util.List;

/**
 * Resource for storing message for unrecognized exceptions.
 */
public class UnrecognizedPropertyMessageResource extends MessageResource {

    private String propertyName;

    private List<String> fields;

    /**
     * Default constructor.
     * @param messageType messageType
     * @param message message
     * @param propertyName propertyName
     * @param fields fields
     */
    public UnrecognizedPropertyMessageResource(final MessageType messageType, final String message, final String propertyName, final List<String> fields) {
        super(messageType, message);
        this.propertyName = propertyName;
        this.fields = fields;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(final String propertyName) {
        this.propertyName = propertyName;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(final List<String> fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        UnrecognizedPropertyMessageResource that = (UnrecognizedPropertyMessageResource) o;

        if (propertyName != null ? !propertyName.equals(that.propertyName) : that.propertyName != null) {
            return false;
        }
        return !(fields != null ? !fields.equals(that.fields) : that.fields != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (propertyName != null ? propertyName.hashCode() : 0);
        result = 31 * result + (fields != null ? fields.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("propertyName", propertyName)
                .append("fields", fields)
                .toString();
    }
}
