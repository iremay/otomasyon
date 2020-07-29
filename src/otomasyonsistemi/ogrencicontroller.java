package otomasyonsistemi;

import java.util.List;    
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;    
import org.springframework.web.bind.annotation.PathVariable;    
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;     
import otomasyonsistemi.ogrenci;    
import otomasyonsistemi.ogrenciDao;
    
	
@Controller    
	public class ogrencicontroller {  
	    @Autowired    
	    ogrenciDao dao;//will inject dao from XML file    
	        
	    /*It displays a form to input data, here "command" is a reserved request attribute  
	     *which is used to display object data into form  
	     */    
	    @RequestMapping("/ogrform")    
	    public String showform(Model m){    
	        m.addAttribute("command", new ogrenci());  
	        return "ogrform";   
	    }    
	    /*It saves object into database. The @ModelAttribute puts request data  
	     *  into model object. You need to mention RequestMethod.POST method   
	     *  because default request is GET*/    
	    @RequestMapping(value="/save",method = RequestMethod.POST)    
	    public String save(@ModelAttribute("ogr") ogrenci ogrenci){    
	        dao.save(ogrenci);    
	        return "redirect:/viewogr";//will redirect to viewogr request mapping    
	    }    
	    /* It provides list of employees in model object */    
	    @RequestMapping("/viewogr")    
	    public String viewemp(Model m){    
	        List<ogrenci> list=dao.getogrenci();    
	        m.addAttribute("list",list);  
	        return "viewemp";    
	    }    
	    /* It displays object data into form for the given id.   
	     * The @PathVariable puts URL data into variable.*/    
	    @RequestMapping(value="/editogr/{id}")    
	    public String edit(@PathVariable int id, Model m){    
	        ogrenci ogrenci=dao.getogrById(id);    
	        m.addAttribute("command",ogrenci);  
	        return "ogreditform";    
	    }    
	    /* It updates model object. */    
	    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("ogr") ogrenci ogrenci){    
	        dao.update(ogrenci);    
	        return "redirect:/viewogr";    
	    }    
	    /* It deletes record for the given id in URL and redirects to /viewemp */    
	    @RequestMapping(value="/deleteogr/{id}",method = RequestMethod.GET)    
	    public String delete(@PathVariable int id){    
	        dao.delete(id);    
	        return "redirect:/viewemp";    
	    }     

}
