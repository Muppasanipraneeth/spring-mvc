package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class QueryController {

    @GetMapping("/getinfo")
    public String getSomeInfo(@RequestParam("name") String name,@RequestParam("course")String course, Map<String, Object> map) {


        String info ="hey "+name+" this is simple "+course;
        map.put("msg",info);
        return "home";

    };
    @GetMapping("/getinfomartion/{name}/{course}")
    public String getSomeInfomoration(@PathVariable("name") String name, @PathVariable("course")String course, Map<String, Object> map) {


        String info ="hey "+name+" this is simple "+course;
        map.put("msg",info);
        return "home";

    };
    @GetMapping("/getPatientInfo")
    public String getPatientInfo(@RequestParam(value = "name",required = false, defaultValue = "Guest") String name, Map<String, Object> map) {


        String info ="hey "+name+" this is simple ";
        map.put("msg",info);
        return "home";

    };

    @GetMapping("/getCourseDetails/users/{userId}/courses/{CourseId}")
    public String getCourseDetails(@PathVariable(value = "userId") String userId,@PathVariable(value = "CourseId")String courseId, Map<String, Object> map) {


        String info ="hey your userId "+userId+"Course Id" +"is : "+courseId+"  ";
        map.put("msg",info);
        return "home";

    };
    @GetMapping("/Search")
    public String getCourseKeys(@RequestParam(value = "tags",required = false)List<String> tags, Map<String, Object> map) {


        String info =null;
        if(tags!=null&&tags.size()>0){
        info="This course are not avl"+tags.toString();
        }
        map.put("msg",info);
        return "home";

    };
    @GetMapping("/class/{className}/students")
    public String getStudents(@PathVariable("className") String className,@RequestParam String rollNo, @RequestParam String  subject,Map<String, Object> map) {
      String info=null;
      info= "Student with roll no "+ rollNo+" in class "+className+" studying "+subject;
      map.put("msg",info);

        return "home";
    }
    @GetMapping("/books")
    public String getBooks(@RequestParam(value = "author",required = true) String author,@RequestParam(value = "genre", defaultValue = "all") String genre, @RequestParam(value = "page", defaultValue = "1")String page ,Map<String, Object> map) {

        String info =null;
        info="Showing books by "+author+", genre : "+genre + " page , "+page;
            map.put("msg",info);
        return  "home";
    }

}
