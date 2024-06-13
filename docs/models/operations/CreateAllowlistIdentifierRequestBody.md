# CreateAllowlistIdentifierRequestBody


## Fields

| Field                                                                                                                                                                        | Type                                                                                                                                                                         | Required                                                                                                                                                                     | Description                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `identifier`                                                                                                                                                                 | *String*                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                           | The identifier to be added in the allow-list.<br/>This can be an email address, a phone number or a web3 wallet.                                                             |
| `notify_`                                                                                                                                                                    | *Optional<? extends Boolean>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                           | This flag denotes whether the given identifier will receive an invitation to join the application.<br/>Note that this only works for email address and phone number identifiers. |