package cesar.next.desafio.desafionextcesar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cesar.next.desafio.desafionextcesar.Ententies.Project;
import cesar.next.desafio.desafionextcesar.database.ProjectRepository;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping()
    public List<Project> list() {
        return projectRepository.findAll();
    }

    @PostMapping()
    public void save(@RequestBody Project project) {
        projectRepository.save(project);
    }
}
