# Pattern Atlas API

## How to generate a new Liquibase changelog for changed database schema

1. have a database instance running with the new schema on port 5060
2. hava a database instance running with the old schema on port 5061

create the file `liquibase.properties` with the following content:
```
url=jdbc:postgresql://localhost:5061/patternatlas
username=patternatlas
password=patternatlas
referenceUrl=jdbc:postgresql://localhost:5060/patternatlas
referenceUsername=patternatlas
referencePassword=patternatlas
liquibase.hub.mode=off
```

Run: `liquibase diff-changelog --changelog-file=new_changelog.xml`

## Troubleshooting

### Liquibase ChangelogParseException the file was not found

Remove the `file:` prefix from the referenced files in the `patternatlas_full.xml` file.

### Liquibase can't find `patternatlas_schema.xml`

Copy all the Liquibase changelog files into a folder inside the project folder and include this folder in the classpath.
This can be done for example in the run configuration in IntelliJ.
