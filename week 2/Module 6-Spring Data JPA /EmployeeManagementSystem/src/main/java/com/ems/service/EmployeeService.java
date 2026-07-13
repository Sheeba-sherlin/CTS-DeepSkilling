@Autowired
private EmployeeRepository repository;

public List<EmployeeProjection> getProjection() {

    return repository.getEmployeeProjection();

}