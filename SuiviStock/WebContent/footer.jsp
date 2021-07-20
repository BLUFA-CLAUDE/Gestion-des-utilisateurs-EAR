<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<footer class="footer">
                <div class="container-fluid">
                    <nav>
                        
                        <p class="copyright text-center">
                            ©
                            <script>
                                document.write(new Date().getFullYear())
                            </script>
                            <a href="">Gestion Stock</a>, fabriquer avec amour par BLUFA Corporation
                        </p>
                    </nav>
                </div>
            </footer>
        </div>
    </div>
    
</body>
<!--   Core JS Files   -->
<script src="./public/template/assets/js/core/jquery.3.2.1.min.js" type="text/javascript"></script>
<script src="./public/template/assets/js/core/popper.min.js" type="text/javascript"></script>
<script src="./public/template/assets/js/core/bootstrap.min.js" type="text/javascript"></script>
<!--  Plugin for Switches, full documentation here: http://www.jque.re/plugins/version3/bootstrap.switch/ -->
<script src="./public/template/assets/js/plugins/bootstrap-switch.js"></script>
<!--  Google Maps Plugin    -->
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
<!--  Chartist Plugin  -->
<script src="./public/template/assets/js/plugins/chartist.min.js"></script>
<!--  Notifications Plugin    -->
<script src="./public/template/assets/js/plugins/bootstrap-notify.js"></script>
<!-- Control Center for Light Bootstrap Dashboard: scripts for the example pages etc -->
<script src="./public/template/assets/js/light-bootstrap-dashboard.js?v=2.0.0 " type="text/javascript"></script>
<!-- Light Bootstrap Dashboard DEMO methods, don't include it in your project! -->
<script src="./public/template/assets/js/demo.js"></script>
<script type="text/javascript">
    $(document).ready(function() {
        // Javascript method's body can be found in assets/js/demos.js
        demo.initDashboardPageCharts();

        demo.showNotification();

    });
</script>

</html>
