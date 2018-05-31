
package validation;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.servlet.http.Part;

@FacesValidator("validator.Imagem")
public class ImagemValidator implements Validator {

    private static final int MAX_SIZE = 2 * 1024 * 1024;

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        Part foto = (Part) value;

        if (foto != null && foto.getSize() > MAX_SIZE) {
            FacesMessage msg = new FacesMessage("A foto deve ter o tamanho máximo de 2mb!");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }

        if (foto != null && !"image/png".equals(foto.getContentType()) && (!"image/jpeg".equals(foto.getContentType()))) {
            FacesMessage msg = new FacesMessage("Tipo de arquivo inválido, a foto deve ser jpg ou png");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
    }
}
