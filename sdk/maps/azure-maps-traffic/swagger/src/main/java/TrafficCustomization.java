import com.azure.autorest.customization.Customization;
import com.azure.autorest.customization.LibraryCustomization;
import com.azure.autorest.customization.PackageCustomization;
import com.azure.autorest.customization.ClassCustomization;
import com.azure.autorest.customization.MethodCustomization;
import org.slf4j.Logger;

public class TrafficCustomization extends Customization {

    @Override
    public void customize(LibraryCustomization libraryCustomization, Logger logger) {

        PackageCustomization models = libraryCustomization.getPackage("com.azure.maps.traffic.models");

        // TODO Auto-generated method stub
        ClassCustomization classCustomization = models.getClass("RouteMatrix");
        classCustomization.removeMethod("getResponse");
        System.err.println(" =============== RUNNING CUSTOMIZATION ============");
    }
}