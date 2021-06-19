package app;

import java.util.ArrayList;

import io.javalin.http.Context;
import io.javalin.http.Handler;

/**
 * Example Index HTML class using Javalin
 * <p>
 * Generate a static HTML page using Javalin
 * by writing the raw HTML into a Java String object
 *
 * @author Timothy Wiley, 2021. email: timothy.wiley@rmit.edu.au
 * @author Santha Sumanasekara, 2021. email: santha.sumanasekara@rmit.edu.au
 */
public class Index implements Handler {

    // URL of this page relative to http://localhost:7000/
    public static final String URL = "/";

    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = "<!DOCTYPE html><html lang='en'><head> <meta charset='UTF-8'> <meta http-equiv='X-UA-Compatible' content='IE=edge'> <meta name='viewport' content='width=device-width, initial-scale=1.0'> <title>Milestone Project</title> <link rel='stylesheet' href='tailwind.min.css'> <link rel='stylesheet' href='main.css'> <link rel='stylesheet' href='jquery-ui.min.css'> <link rel='stylesheet' href='jquery-ui.structure.min.css'> <link rel='stylesheet' href='jquery-ui.theme.min.css'> <link rel='stylesheet' type='text/css' href='datatables.min.css'/></head><body> <div class='cover flex'> <div class='sidebar hidden relative px-2'> <div class='top'> <div class='logo pl-1 pt-4'> <img src='logo.svg' alt='logo'> </div><input type='text' name='search' id='search' class='mx-auto' placeholder='Search Country...'> </div><div class='bottom pt-3'> <div class='item cursor-pointer w-full px-3 flex flex-row h-10 items-center my-3 rounded-lg selected'> <div class='icon'> <img src='home.svg' alt='Home'> </div><div class='name-item cursor-pointer text-white px-2'>Home</div></div><div class='item cursor-pointer w-full px-3 flex flex-row h-10 items-center my-3 rounded-lg '> <div class='icon'> <img src='overview.svg' alt='Home'> </div><div class='name-item cursor-pointer text-white px-2'>Overview</div></div><div class='item cursor-pointer w-full px-3 flex flex-row h-10 items-center my-3 rounded-lg '> <div class='icon'> <img src='infections.svg' alt='Home'> </div><div class='name-item cursor-pointer text-white px-2'>Infections by Country</div></div><div class='item cursor-pointer w-full px-3 flex flex-row h-10 items-center my-3 rounded-lg '> <div class='icon'> <img src='deaths.svg' alt='Home'> </div><div class='name-item cursor-pointer text-white px-2'>Deaths by Country</div></div><div class='item cursor-pointer w-full px-3 flex flex-row h-10 items-center my-3 rounded-lg '> <div class='icon'> <img src='countries.svg' alt='Home'> </div><div class='name-item cursor-pointer text-white px-2'>Compare Countries</div></div><div class='item cursor-pointer w-full px-3 flex flex-row h-10 items-center my-3 rounded-lg '> <div class='icon'> <img src='reports.svg' alt='Home'> </div><div class='name-item cursor-pointer text-white px-2'>Reports</div></div></div><div class='profile-short-menu absolute bottom-0 left-0 flex justify-between px-4 w-full h-16 border-t border-gray-100 items-center shadow-lg'> <div class='profile-pic w-12'> <img src='profile.jpeg' alt='Profile' class='w-full rounded-full'> </div><div class='icons'> <span class='fas fa-cog fa-lg text-white'></span> </div></div></div><div class='container w-full h-full'> <nav class='nav px-4 h-10'> <div class='patch'> <span class='fas fa-bars fa-lg' id='nav_control_icon'></span> <input type='checkbox' id='nav_control' class='cursor-pointer'> </div></nav> <div class='content px-4' id='content'> <div class='tagline'> <h1 class='text-2xl font-semibold'>Be Safe! Cause Every Life Matters</h1> </div><div class='details mt-12'> <div class='section1'> <div class='heading flex'> <h1 class='text-lg font-semibold'>What is Coronavirus?</h1> <p class='text-gray-400 text-sm align-baseline pt-1'>&nbsp;&nbsp;&nbsp;(Source: <a href='https://en.wikipedia.org/wiki/Coronavirus'>Wikipedia <span class='fas fa-external-link-alt fa-sm'></span></a>)</p></div><div class='data px-4'> <div class='image w-1/12'> <img src='https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/SARS-CoV-2_without_background.png/1200px-SARS-CoV-2_without_background.png' alt='SARS-CoV-2'> </div><div class='text'> Coronaviruses are a group of related RNA viruses that cause diseases in mammals and birds. In humans and birds, they cause respiratory tract infections that can range from mild to lethal. Mild illnesses in humans include some cases of the common cold (which is also caused by other viruses, predominantly rhinoviruses), while more lethal varieties can cause SARS, MERS, and COVID-19. In cows and pigs they cause diarrhea, while in mice they cause hepatitis and encephalomyelitis. Coronaviruses constitute the subfamily Orthocoronavirinae, in the family Coronaviridae, order Nidovirales, and realm Riboviria.[4][5] They are enveloped viruses with a positive-sense single-stranded RNA genome and a nucleocapsid of helical symmetry.[6] The genome size of coronaviruses ranges from approximately 26 to 32 kilobases, one of the largest among RNA viruses.[7] They have characteristic club-shaped spikes that project from their surface, which in electron micrographs create an image reminiscent of the solar corona, from which their name derives. </div></div></div></div><div class='section2'> <div class='card-container'> <div id='left-side'> <div class='container-img-desktop'> <img class='woman-desk' src='https://raw.githubusercontent.com/ViktoriiaZaichuk/faq-accordion-card-main/48bb14e632a5bd5d9190da88b45d21622dd2ed14/img/illustration-woman-online-desktop.svg' alt='woman'> </div><div class='container-img-mob'> <img class='pattern-mobile' src='https://raw.githubusercontent.com/ViktoriiaZaichuk/faq-accordion-card-main/48bb14e632a5bd5d9190da88b45d21622dd2ed14/img/bg-pattern-mobile.svg' alt='pattern'> <img class='woman-mobile' src='https://raw.githubusercontent.com/ViktoriiaZaichuk/faq-accordion-card-main/48bb14e632a5bd5d9190da88b45d21622dd2ed14/img/illustration-woman-online-mobile.svg' alt='woman'> </div><img class='box-img' src='https://raw.githubusercontent.com/ViktoriiaZaichuk/faq-accordion-card-main/48bb14e632a5bd5d9190da88b45d21622dd2ed14/img/illustration-box-desktop.svg' alt='box'> </div><div id='right-side'> <h1 class='text-2xl'>FAQ</h1> <div class='question-container'> <div class='question'> <p>What are the symptoms of COVID-19?</p><img src='https://raw.githubusercontent.com/ViktoriiaZaichuk/faq-accordion-card-main/48bb14e632a5bd5d9190da88b45d21622dd2ed14/img/icon-arrow-down.svg' alt='arrow down' class='arrow'> </div><div class='hidden'> <p>The most common symptoms of COVID-19 are:</p><ul> <li>&nbsp;&nbsp;•&nbsp;Fever</li><li>&nbsp;&nbsp;•&nbsp;Dry cough</li><li>&nbsp;&nbsp;•&nbsp;Fatigue</li></ul> <br><p>Other symptoms that are less common and may affect some patients include:</p><ul> <li>&nbsp;&nbsp;•&nbsp;Loss of taste or smell</li><li>&nbsp;&nbsp;•&nbsp;Nasal congestion</li><li>&nbsp;&nbsp;•&nbsp;Conjunctivitis (also known as red eyes)</li><li>&nbsp;&nbsp;•&nbsp;Sore throat</li><li>&nbsp;&nbsp;•&nbsp;Headache</li><li>&nbsp;&nbsp;•&nbsp;Muscle or joint pain</li><li>&nbsp;&nbsp;•&nbsp;Different types of skin rash</li><li>&nbsp;&nbsp;•&nbsp;Nausea or vomiting</li><li>&nbsp;&nbsp;•&nbsp;Diarrhea</li><li>&nbsp;&nbsp;•&nbsp;Chills or dizziness</li></ul> <br><p>Symptoms of severe COVID‐19 disease include:</p><ul> <li>&nbsp;&nbsp;•&nbsp;Shortness of breath</li><li>&nbsp;&nbsp;•&nbsp;Loss of appetite</li><li>&nbsp;&nbsp;•&nbsp;Confusion</li><li>&nbsp;&nbsp;•&nbsp;Persistent pain or pressure in the chest</li><li>&nbsp;&nbsp;•&nbsp;High temperature (above 38 °C)</li></ul> <br><p>Other less common symptoms are:</p><ul> <li>&nbsp;&nbsp;•&nbsp;Irritability</li><li>&nbsp;&nbsp;•&nbsp;Confusion</li><li>&nbsp;&nbsp;•&nbsp;Reduced consciousness (sometimes associated with seizures)</li><li>&nbsp;&nbsp;•&nbsp;Anxiety</li><li>&nbsp;&nbsp;•&nbsp;Depression</li><li>&nbsp;&nbsp;•&nbsp;Sleep disorders</li></ul> <br>More severe and rare neurological complications such as strokes, brain inflammation, delirium and nerve damage.<br>People of all ages who experience fever and/or cough associated with difficulty breathing or shortness of breath, chest pain or pressure, or loss of speech or movement should seek medical care immediately. If possible, call your health care provider, hotline or health facility first, so you can be directed to the right clinic. </div></div><div class='question-container'> <div class='question'> <p>What Happens to people who get COVID19?</p><img src='https://raw.githubusercontent.com/ViktoriiaZaichuk/faq-accordion-card-main/48bb14e632a5bd5d9190da88b45d21622dd2ed14/img/icon-arrow-down.svg' alt='arrow down' class='arrow'> </div><div class='hidden'><br>Among those who develop symptoms, most (about 80%) recover from the disease without needing hospital treatment. About 15% become seriously ill and require oxygen and 5% become critically ill and need intensive care.<br><br>Complications leading to death may include respiratory failure, acute respiratory distress syndrome (ARDS), sepsis and septic shock, thromboembolism, and/or multiorgan failure, including injury of the heart, liver or kidneys.<br><br>In rare situations, children can develop a severe inflammatory syndrome a few weeks after infection. </div></div><div class='question-container'> <div class='question'> <p>Who are most at risk of getting COVID19?</p><img src='https://raw.githubusercontent.com/ViktoriiaZaichuk/faq-accordion-card-main/48bb14e632a5bd5d9190da88b45d21622dd2ed14/img/icon-arrow-down.svg' alt='arrow down' class='arrow'> </div><div class='hidden'><br>People aged 60 years and over, and those with underlying medical problems like high blood pressure, heart and lung problems, diabetes, obesity or cancer, are at higher risk of developing serious illness.<br><br>However, anyone can get sick with COVID-19 and become seriously ill or die at any age. </div></div><div class='question-container'> <div class='question'> <p>What is the difference bwtween isolation and quarantine?</p><img src='https://raw.githubusercontent.com/ViktoriiaZaichuk/faq-accordion-card-main/48bb14e632a5bd5d9190da88b45d21622dd2ed14/img/icon-arrow-down.svg' alt='arrow down' class='arrow'> </div><div class='hidden'><br>Both isolation and quarantine are methods of preventing the spread of COVID-19.<br><br><b>Quarantine</b> is used for anyone who is a contact of someone infected with the SARS-CoV-2 virus, which causes COVID-19, whether the infected person has symptoms or not. Quarantine means that you remain separated from others because you have been exposed to the virus and you may be infected and can take place in a designated facility or at home. For COVID-19, this means staying in the facility or at home for 14 days.<br><br><b>Isolation</b> is used for people with COVID-19 symptoms or who have tested positive for the virus. Being in isolation means being separated from other people, ideally in a medically facility where you can receive clinical care. If isolation in a medical facility is not possible and you are not in a high risk group of developing severe disease, isolation can take place at home. If you have symptoms, you should remain in isolation for at least 10 days plus an additional 3 days without symptoms. If you are infected and do not develop symptoms, you should remain in isolation for 10 days from the time you test positive. </div></div><div class='question-container'> <div class='question'> <p>Are antibiotics effective in preventing or treating COVID19?</p><img src='https://raw.githubusercontent.com/ViktoriiaZaichuk/faq-accordion-card-main/48bb14e632a5bd5d9190da88b45d21622dd2ed14/img/icon-arrow-down.svg' alt='arrow down' class='arrow'> </div><div class='hidden'><br>Antibiotics do not work against viruses; they only work on bacterial infections. COVID-19 is caused by a virus, so antibiotics do not work. Antibiotics should not be used as a means of prevention or treatment of COVID-19.<br><br>In hospitals, physicians will sometimes use antibiotics to prevent or treat secondary bacterial infections which can be a complication of COVID-19 in severely ill patients. They should only be used as directed by a physician to treat a bacterial infection. </div></div></div></div></div></div></div></div></div><script defer src='https://use.fontawesome.com/releases/v5.15.3/js/all.js' integrity='sha384-haqrlim99xjfMxRP6EWtafs0sB1WKcMdynwZleuUSwJR0mDeRYbhtY+KPMr+JL6f' crossorigin='anonymous'></script> <script src='https://code.jquery.com/jquery-3.5.1.js'></script> <script src='https://cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js'></script> <script src='jquery-ui.min.js'></script> <script src='https://cdn.jsdelivr.net/npm/chart.js@3.3.2/dist/chart.min.js'></script> <script src='main.js'></script></body></html>";

        // DO NOT MODIFY THIS
        // Makes Javalin render the webpage
        context.html(html);
    }

}
