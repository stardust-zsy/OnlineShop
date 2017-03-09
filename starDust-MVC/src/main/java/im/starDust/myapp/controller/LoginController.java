package im.starDust.myapp.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {
	@RequestMapping("/login")
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {

		if (error != null) {
			model.addAttribute("error", "Invalid userName and Password");
		}
		if (logout != null) {
			model.addAttribute("msg", "You have been logged out");
		}

		return "login";
	}
	
	
	@RequestMapping("/testOcr")
	public void main() {
        // ImageIO.scanForPlugins(); // for server environment
        File imageFile = new File("eurotext.tif");
        ITesseract instance = new Tesseract(); // JNA Interface Mapping
        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping
        // instance.setDatapath("<parentPath>"); // replace <parentPath> with path to parent directory of tessdata
        // instance.setLanguage("eng");

        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }

}





