# Generic Ecommerce Recommendation Engine Template

## Documentation

### Steps to run

##### Step 1: Create the gradle wrapper to get a stable version of gradle.

```
$ pio app new ecommerce01
# if ecommerce01 already exists,clean data first
$ pio app data-delete ecommerce01 
```

##### Step 2: Start PredictionIO Event Server.

```
$ pio eventserver
```

##### Step 3: Import More Sample Data.

Install Python SDK 

```
$ pip install predictionio
# or
$ easy_install predictionio

```

Replace the value of access_key parameter by your Access Key and run

```
$ python data/loan.py --file data/loan_sample.csv --access_key $ACCESS_KEY
```

Find your access_key

```
$  pio app list

```

You should see something like this:

```
[INFO] [App$]                 Name |   ID |                                                       Access Key | Allowed Event(s)
[INFO] [App$]          ecommerce01 |    2 | Jhe05JGGEFzWHZpDDIkCs1lKyujGMXg4GXBa7i0QPMh2oqmW8G0RcbszZkMNHbjG | (all)
[INFO] [App$]              tapster |    1 | Dw5lyfoJxdEz2N1lQ9xskPDn5G40xaVNyVLUwtza9IbsYp0shAc2CMHWWqh5yb3a | (all)
[INFO] [App$] Finished listing 2 app(s).
```

##### Step 4: Building

```
$ pio build --verbose
```

##### Step 5: Training the Predictive Model

```
$ pio train
```

##### Step 6: Deploying the Engine
```
$ pio deploy
```

## Versions

### v0.1.0

- Create the basic engine template with the purpose of:

  - Provide generic recommendation capability on top of machine learning algorithms
  - Generalize scenarios where users buy products and write reviews
