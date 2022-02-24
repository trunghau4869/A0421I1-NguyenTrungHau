<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<head>
    <title>Email</title>
</head>
<body>
<div class="container">
    <h1 class="text-center">Setting</h1>
    <table class="table table-striped">
        <form action="save" method="post">
            <tr>
                <th>
                    <h4>Language:</h4></th>
                <td>
                    <select>
                        <option>
                            English
                        </option>
                        <option>
                            Vietnamese
                        </option>
                        <option>
                            Japanese
                        </option>
                        <option>
                            Chinese
                        </option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>
                    <h4>Page Size:</h4></th>
                <td>
                    <p>Show
                        <select>
                            <option>
                                5
                            </option>
                            <option>
                                10
                            </option>
                            <option>
                                15
                            </option>
                            <option>
                                25
                            </option>
                            <option>
                                50
                            </option>
                            <option>
                                100
                            </option>
                        </select>
                        mails per page
                    </p>
                </td>
            </tr>
            <tr>
                <th>
                    <h4>Spams filter:</h4></th>
                <td><input type="checkbox">Enable spams filter</td>
            </tr>
            <tr>
            <th><h4>Signature:</h4></th>
            <td><input type="text"></td>
            </tr>

            <tr>

                <button type="submit" class="btn btn-primary">Update</button>
                <button type="submit" class="btn btn-light">Cancel</button>
            </tr>
        </form>
    </table>
</div>
</body>
</html>