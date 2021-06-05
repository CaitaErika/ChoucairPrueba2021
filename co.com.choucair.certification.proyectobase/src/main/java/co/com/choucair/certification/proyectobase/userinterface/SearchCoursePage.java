package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona la certificacion choucair").located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_COURSE = Target.the("Busca el curso").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Clic para buscar el curso").located(By.xpath("//button[contains(@class,'btn btn-secondary')]"));
    public static final Target SELECT_COURSE = Target.the("Clic para buscar el curso").located(By.xpath("//h4[contains(@class,'result-title')]"));

}
