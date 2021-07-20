
   <!-- Required Jqurey -->
   <script src="public/assets/plugins/Jquery/dist/jquery.min.js"></script>
   <script src="public/assets/plugins/jquery-ui/jquery-ui.min.js"></script>
   <script src="public/assets/plugins/tether/dist/js/tether.min.js"></script>

   <!-- Required Fremwork -->
   <script src="public/assets/plugins/bootstrap/js/bootstrap.min.js"></script>

   <!-- Scrollbar JS-->
   <script src="public/assets/plugins/jquery-slimscroll/jquery.slimscroll.js"></script>
   <script src="public/assets/plugins/jquery.nicescroll/jquery.nicescroll.min.js"></script>

   <!--classic JS-->
   <script src="public/assets/plugins/classie/classie.js"></script>

   <!-- notification -->
   <script src="public/assets/plugins/notification/js/bootstrap-growl.min.js"></script>

   <!-- Sparkline charts -->
   <script src="public/assets/plugins/jquery-sparkline/dist/jquery.sparkline.js"></script>

   <!-- Counter js  -->
   <script src="public/assets/plugins/waypoints/jquery.waypoints.min.js"></script>
   <script src="public/assets/plugins/countdown/js/jquery.counterup.js"></script>

   <!-- Echart js -->
   <script src="public/assets/plugins/charts/echarts/js/echarts-all.js"></script>

   <script src="https://code.highcharts.com/highcharts.js"></script>
   <script src="https://code.highcharts.com/modules/exporting.js"></script>
   <script src="https://code.highcharts.com/highcharts-3d.js"></script>

   <!-- custom js -->
   <script type="text/javascript" src="public/assets/js/main.min.js"></script>
   <script type="text/javascript" src="public/assets/pages/dashboard.js"></script>
   <script type="text/javascript" src="public/assets/pages/elements.js"></script>
   <script src="public/assets/js/menu.min.js"></script>
<script>
var $window = $(window);
var nav = $('.fixed-button');
$window.scroll(function(){
    if ($window.scrollTop() >= 200) {
       nav.addClass('active');
    }
    else {
       nav.removeClass('active');
    }
});
</script>

</body>

</html>
