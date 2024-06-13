# OrganizationSettings


## Fields

| Field                                                                                                                       | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `object`                                                                                                                    | [com.clerk.backend_api.models.components.OrganizationSettingsObject](../../models/components/OrganizationSettingsObject.md) | :heavy_check_mark:                                                                                                          | String representing the object's type. Objects of the same type share the same value.                                       |
| `enabled`                                                                                                                   | *boolean*                                                                                                                   | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |
| `maxAllowedMemberships`                                                                                                     | *long*                                                                                                                      | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |
| `maxAllowedRoles`                                                                                                           | *Optional<? extends Long>*                                                                                                  | :heavy_minus_sign:                                                                                                          | N/A                                                                                                                         |
| `maxAllowedPermissions`                                                                                                     | *Optional<? extends Long>*                                                                                                  | :heavy_minus_sign:                                                                                                          | N/A                                                                                                                         |
| `creatorRole`                                                                                                               | *String*                                                                                                                    | :heavy_check_mark:                                                                                                          | The role key that a user will be assigned after creating an organization.                                                   |
| `adminDeleteEnabled`                                                                                                        | *boolean*                                                                                                                   | :heavy_check_mark:                                                                                                          | The default for whether an admin can delete an organization with the Frontend API.                                          |
| `domainsEnabled`                                                                                                            | *boolean*                                                                                                                   | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |
| `domainsEnrollmentModes`                                                                                                    | List<[com.clerk.backend_api.models.components.DomainsEnrollmentModes](../../models/components/DomainsEnrollmentModes.md)>   | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |
| `domainsDefaultRole`                                                                                                        | *String*                                                                                                                    | :heavy_check_mark:                                                                                                          | The role key that it will be used in order to create an organization invitation or suggestion.                              |